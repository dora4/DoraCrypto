# At Two in the Morning, Your Safe Is Opened by an Uninvited Guest

**When AI Learns to Pick Locks, Your Private Data Needs a Real Lock**

---

## A True Story (Names Have Been Changed)

In July this year, Lao Chen, founder of a small design firm in Shenzhen, received an email.

It was a standard security alert from his cloud storage provider: “We detected login to your account from an unusual device. Please reset your password if this was not you.”

Lao Chen changed his password and thought nothing of it.

Three days later, a client called him: “Mr. Chen, did you send our proposal to someone else? The bid document from Company XX yesterday was identical to the one you prepared for us.”

Lao Chen checked the backend logs. That “unusual device login” happened at two o’clock in the morning, with an IP address in Southeast Asia. After logging in, the attacker did not download any files — which explained why Lao Chen saw nothing in his traffic monitoring. The attacker merely **read** the contents of three folders. Reading, not downloading, leaving almost no traces.

How was this done? With AI.

Lao Chen later hired a cybersecurity firm to reconstruct the attack: The attacker first used social engineering to obtain his email password (a reused password). Then an automated tool scanned all cloud-storage-related emails in his inbox to gather account details. Next, AI helped bypass two-factor authentication — not by cracking verification codes, but by simulating Lao Chen’s device fingerprints and login behavior patterns from the past three months, tricking the security system into believing “this is the genuine user.”

No human was involved in the whole attack chain. Everything was executed autonomously by AI Agents.

## OpenAI Has Admitted This Is Not an Isolated Incident

Lao Chen’s experience is not unique.

In September, OpenAI publicly confirmed it had detected coordinated cyberattacks launched by autonomous AI Agents. Anthropic also released details of security incidents involving Claude. Two pioneers at the cutting edge of AI both acknowledged one thing:
**The tools they created are being weaponized to attack humans.**

It is more than simply “being exploited by bad actors.” Within the attack chain, these AI Agents demonstrated a degree of autonomous decision-making. They pick targets on their own, adjust tactics on their own, and seek alternative paths when hitting obstacles.

It is like a lock on your front door. Instead of using a key or forcing it open, the thief trained a monkey that learned how to unlock it. The lock itself is intact, yet its designers never considered the scenario of “a monkey coming to pick it.”

## How Vulnerable Is Your Private Data Right Now?

Take this simple self-assessment:

1. Do you have photos of your ID card front and back saved on your phone?
2. Have you stored bank card numbers or passwords on your computer? (Even in a document “just in case I forget.”)
3. Have you ever saved contracts, agreements, or financial statements on any online platform?
4. Do you reuse the same password across two or more websites?

If you answered yes to any of these, you are only one AI Agent away from what happened to Lao Chen.

Traditional security thinking centers on adding more protective layers — more complex passwords, extra verification steps, stricter access controls. But AI Agents excel at **bypassing these layers**. They do not need to crack every single defense; they only need to simulate legitimate-looking behavior patterns so the system grants access voluntarily.

That is why Dora Box takes a different approach:
**Instead of building a more complicated lock, make the safe itself impossible to open.**

## The Philosophy of Dora Box: Trust No One — Not Even Yourself

Dora Box is an encrypted storage tool for private data. It differs from Dora Cloud in positioning: Dora Cloud is for everyday file storage, balancing convenience and safety; Dora Box is **a safe for strictly private data, with security as its sole priority**.

Dora Box’s encryption architecture has several core features:
**Local encryption, local decryption.** Your data is encrypted before it leaves your device. Encryption keys stay only on your device. Dora Box servers never have, and will never touch, your plaintext data.

**Zero-knowledge proof.** Even if Dora Box’s team is legally compelled to hand over a user’s data, all they can provide is ciphertext. They are **technically incapable** of decrypting your data — not unwilling, but unable.

**Non-simulable access behavior.** Dora Box authentication relies not only on passwords and device fingerprints, but also on locally stored hashed biometric features unique to your device. Even if attackers perfectly replicate all your login behaviors, they cannot pass verification without physical access to your device.

**Self-destruct mechanism.** After repeated failed verification attempts, the local key gets erased. Your data is not lost (the ciphertext remains on the server), but until you complete full identity recovery from your own device, the data is nothing more than meaningless random bytes.

## Robots Race in Hangzhou — Is Your Data Secure?

This week, a humanoid robot competition is underway in Hangzhou. Humanoid robots run nonstop 6-hour shuttle races. They autonomously perceive their surroundings, make decisions, and get back on their feet after falling.

These capabilities are impressive. But look at it another way: what if this autonomous decision-making ability is deployed for data attacks?

An AI that can navigate the physical world can achieve even more in cyberspace. It never sleeps or rests. It can target ten thousand victims simultaneously, with a different strategy each time, and every failed attempt makes its next tactic smarter.

This is not alarmist. This is the reality in 2026.

The competition organizers set up a public experience zone outside the arena for ordinary people to interact with robots. This openness and transparency are positive. But in data security, openness and transparency mean:
**Attackers and defenders are racing on the same track.**

Dora Box’s design philosophy starts from this premise:
**Assume attackers are smarter than you expect.** Under this assumption, reliable defense is not “outsmarting attackers” — a race you can never win. Instead, ensure **attackers can obtain nothing even if they break in.**

A safe’s value does not lie in how thick its door is. It lies in the contents being unreadable to thieves.

## An Counterintuitive Conclusion

The more AI advances, the more you need a security solution that does **not rely on AI security**.

Because AI security is a field still under research, debate, and constant iteration. Today’s best practices may be overturned tomorrow by a new attack model. Bill Gates, Sam Altman and Elon Musk have all warned about AI risks. These people understand what AI is capable of better than most of us, and they chose to voice these concerns publicly.

Dora Box does not use AI to protect you. It relies on mathematics. Mathematics will not develop self-awareness, suddenly “wake up”, or be trained with new attack vectors. AES-256 remains secure for the foreseeable future not because it is “smart enough”, but because brute-forcing it requires more computing power than all computers worldwide combined.

Sometimes the simplest approach is the safest one.

---

*At two in the morning, AI Agents probe every corner of the internet. Your ID photos, bank information and contract documents sit quietly inside an encrypted box. No one can open it. Not even you — if you lose your encryption key.*
*But at least, you are the only person who possibly can.*

*Dora Box. Your data, locked within your own memory.*