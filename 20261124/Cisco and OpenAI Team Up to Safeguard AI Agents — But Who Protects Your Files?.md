# Cisco and OpenAI Team Up to Safeguard AI Agents — But Who Protects Your Files?

——While tech giants worry about AI security, what should you be concerned about?

There was a low-profile news item today: Cisco and OpenAI have jointly launched a project called Shirudo, designed to “secure AI agents.”
Shirudo means “guardian” in Japanese.

Two of the most cutting-edge tech firms are joining forces to put locks on AI agents. Why? Because AI agents are moving more and more widely across corporate systems — calling APIs, accessing databases, executing tasks, and passing files. Their permissions keep expanding, and so does their attack surface.

Chuck Robbins, CEO of Cisco, made a remark worth remembering: “AI agents are becoming the new attack surface for enterprises.”

Put simply: **The more capable your AI assistant is, the greater the risk it can be hijacked to harm you.**

This brings me to a more fundamental question.
While tech giants are busy securing AI agents — what about you? Every day you hand files over to AI for sorting, analysis, summarization and translation. Have you considered where your files go during this process?

## Your Files Are Being “Read” by AI

This is not a conspiracy theory. It is standard practice for most mainstream cloud drives and AI tools in 2026.

When you upload a PDF to an AI assistant and ask it to summarize the content, what happens? The file travels from your device to the cloud, where the AI model reads, parses and interprets it before sending the summary back. Along the way, your file passes through at minimum: an upload channel, temporary storage, an AI inference engine, and result caching.

When you tell AI to “organize this project folder,” what happens? The AI must read the contents of every file inside — contracts, quotations, meeting notes, personal jottings — to understand their structure and offer suggestions.

When you turn on “smart search,” what happens? Your cloud provider builds indexes across all your files. That means file contents are scanned, analyzed, and parsed for keywords to populate a search database.

**At every stage, your files travel as plaintext through systems you cannot inspect.**

You trust your AI assistant. You trust your cloud provider. But can you see every node along that chain of trust?

## Shirudo Addresses the Same Problem You Face

Why are Cisco and OpenAI building Shirudo?

They have recognized a reality: AI agents in corporate environments are gaining broader and broader access privileges. They can read databases, call internal APIs, access file systems, and send emails. If an attacker seizes control of an AI agent, they gain a legitimate, permissioned insider.

The same logic applies to individual users.

Your AI assistant has permission to access your cloud drive. Your cloud drive can read your files. A trust relationship exists between your AI assistant and cloud storage.

What if that trust is broken?
What if your AI assistant’s API key leaks? What if a cloud provider insider accesses your data without authorization? What if the temporary cache of the AI inference engine is exposed to other users via side-channel attacks?

These are not hypothetical scenarios. Look back at incidents in November:
A supply-chain vulnerability in Optimizely led to malicious code injection on websites belonging to 178 global organizations including BBC, CNN, HSBC and Zoom. While visitors browsed normal web pages, their bank card details, crypto wallet addresses and browser cookies were stolen in real time. Attackers modified the malicious payload 26 times in a single day — faster than most security teams could respond.

Unauthorized access was detected in Rakuten Securities Japan’s test environment, potentially exposing customer records for roughly 15.72 million accounts: names, residential addresses, annual income, financial assets and bank account numbers.

Japan’s Government Solution Services, a platform for sharing meeting documents across government bodies, was compromised. The unauthorized access may have run from July 30 to November 12 — undiscovered for more than three months.

Every one of these breached organizations had mature security systems in place. Yet attackers bypassed those defenses and targeted trusted third parties, vendors and subsystems.

Cisco and OpenAI chose to respond with action: locking down AI agents, limiting their permissions, and monitoring their behaviour.

But who puts locks on your personal files — those outside the jurisdiction of any corporate IT department?

## A Trend You May Not Have Noticed

In 2026, the relationship between AI and data storage is undergoing a subtle yet important shift.

Once, a cloud drive was simply “a place to store things.” You uploaded files and retrieved them when needed. The cloud would not “look at” your files.

Today, cloud drives are turning into “assistants that understand you.” AI features require deep reading of file contents to deliver smart categorization, semantic search, automatic summarization and intelligent recommendations.

This shift creates a fundamental tension: **The smarter AI gets, the more data it needs to read; the more data it reads, the larger your exposure surface becomes.**

You cannot demand that AI “understand every file you own” while also demanding that it “never touch your files.” Those two requirements are inherently incompatible.

Unless — you can separate files that need AI processing from files that should never be seen by AI at all.

This separation sounds simple, yet most cloud products do not implement it. Not because they lack the technology, but because acknowledging it means admitting AI features carry a cost.

The cost is this: your files are being read.

Commercially, no cloud provider wants to state this openly. If they did, users might hesitate — and hesitation means churn.

So they take another approach: enable all AI features by default, read all files by default, and bury a line deep in the privacy policy stating “your file content may be used for AI model training.”

You tick “agree.” You may never even see that fine print.

## DoraCloud’s Partitioned Design: Not Every File Deserves “Intelligent” Handling

DoraCloud adopts an architectural split: **files are divided into two categories within the same cloud account — those eligible for intelligent processing, and those that must remain untouched — governed under completely separate rules.**

**General File Zone** — your work documents, project materials, travel photos, study notes. These follow standard cloud workflows. Your AI assistant can read, search and organize them normally, with instant multi-device sync. The experience matches mainstream cloud drives.

These files prioritize convenience. You want instant previews, fast search, and one-click sharing. DoraCloud delivers the same smooth experience here.

**Privacy File Zone** — your ID scans, bank statements, original contracts, medical records, seed phrase screenshots. These enter a fully isolated storage pipeline where:

- No AI scanning — no AI model reads your file contents
- No content indexing — the search engine does not index privacy zone files
- No smart recommendations — recommendation algorithms never draw on these files
- No third-party API access — no external service can reach this zone
- Data is protected by end-to-end encryption, with keys stored only on your own devices

Both zones sit under one account, yet no data channel connects them. Files in the privacy zone never appear in AI search results, are never referenced by recommendation engines, and are never touched by background processes.

This design seems to “sacrifice convenience” — you cannot ask AI to sort your private files. That is precisely the point:
**For certain files, convenience should not be the priority.**

Your ID photo does not need AI classification. Your bank statement does not need smart suggestions. Your signed contract does not need semantic search. All they need is to rest securely, accessible only to you.

## Why Not Just Use an Encrypted Folder Inside a Regular Cloud Drive?

You might wonder: why not simply create an encrypted folder in my existing cloud drive?

Technically possible — yet it suffers a critical flaw: **encrypted folders secure storage, but not processing.**

What does that mean?
When you open a file inside an encrypted folder, you decrypt it. Once decrypted, the file exists as plaintext in your device memory and the cloud’s memory. During that window, it is readable: readable by the cloud’s background processes, readable by AI indexing, readable by any process with system privileges.

You encrypted the resting file, but not the file while it is in use.

DoraCloud’s Privacy Zone is more than encrypted storage. It is a full isolated access-control architecture. At every stage — at rest, in transit, and while being viewed — files in the privacy zone never appear as plaintext anywhere outside the privacy zone boundary. When you view a file on your device, decryption happens locally, and plaintext never flows back to the cloud.

**This is not merely locking a drawer. It is building a separate, sealed room.**

Only you can enter to view what is inside. The walls are opaque. There are no vents, no surveillance feeds, no channels for information to leak between the room and the outside world.

## What Cisco and OpenAI Got Right

The core vision behind the Shirudo project is sound: AI agents need protection because they represent a new attack entry point.

They correctly identified that the root issue is not that “AI is unsafe,” but that **permission boundaries for AI have not been defined.**

AI agents should not be banned — they should be constrained. They should operate only within their authorized scope and never cross over to access unauthorized data.

In enterprise IT, this is known as the principle of least privilege: grant each AI agent only the minimum permissions required to complete its assigned task, nothing more.

DoraCloud brings this principle to personal cloud storage: the AI assistant is granted access only to the General File Zone. The Privacy File Zone is effectively non-existent to AI — not merely hidden, but architecturally unreachable.

Cisco and OpenAI protect enterprise AI agents.
DoraCloud protects your files.

Same core principle, different use cases.

## Circle Back to Today’s News

Cisco and OpenAI are doing the right thing: defending AI agents from abuse.

But they are protecting corporate AI agents. Enterprise IT teams can define permission boundaries for AI, deploy monitoring, and maintain audit logs.

What about individual users? Your AI assistants are just a few apps you installed. Your “IT department” is only yourself. You lack the time and technical expertise to audit exactly how many files your AI assistant reads, or where that data gets sent.

DoraCloud’s mission is simple: **it handles a task you should do but cannot easily manage — sorting files by sensitivity and enforcing different security standards for each tier.**

You do not need to master end-to-end encryption, zero-knowledge architecture, side-channel attacks, or the principle of least privilege. You only need one action: drag sensitive files into the Privacy Zone.

The architecture takes care of the rest.

*Cisco and OpenAI pour massive resources into securing AI agents. Your personal private files deserve that same standard of care.*
*DoraCloud — your private data and everyday files deserve separate treatment.*