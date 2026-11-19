# 27 People, $40.5 Million, and an AI You Cannot Beat

## —When Hackers Adopt Artificial Intelligence, Is Your Safe Strong Enough?

---

On November 18, a little-noticed international news story emerged from Ukraine:
The FBI of the United States and Ukrainian police jointly took down a 27-person hacking ring. The group targeted 28 companies across Europe and America and extorted more than **40.5 million US dollars** in ransom payments.

$40.5 million. At today’s exchange rate, that is nearly 300 million RMB.

Yet that was not what caught my eye most. What stood out was this line:

>
> **The gang leveraged AI technology to automatically place scam calls, impersonate senior executives of well-known companies and launch social engineering attacks.**

AI auto-dialing. AI voice synthesis. AI impersonating executives. AI-run fraud.

With the multiplier effect of AI, these 27 people extracted $40.5 million. That averages out to **$1.5 million per person**.

These are not hackers in the traditional sense. They do not need to find vulnerabilities in your systems. They do not need to write malicious code. They do not need to plant trojans.
All they need is to make one human being believe, over the phone: *“This is your boss. I need you to transfer funds right now.”*

And that person complies.

---

## Humans Will Always Be the Weakest Link in the Security Chain

There is an old saying in cybersecurity: You can spend millions building firewalls, yet what defeats them may just be an email that tricks you into clicking a link.

In 2026, AI has raised the stakes for this age-old problem.

Phishing emails of the past were easy to spot — broken grammar, awkward wording, suspicious sender addresses.
AI-generated phishing emails? Fluent phrasing, coherent logic, tone identical to internal company correspondence.

Scam calls of the past often featured heavy accents, stilted scripts and noisy background audio.
AI scam calls? Hyper-realistic voices, smooth responses, and scripts adjusted in real time based on your replies.

Old-school social engineering attacks required weeks of research to profile targets: their social connections, organizational charts, communication habits.
AI can assemble a full profile from public data within hours, then craft a “perfect” scam script.

**Defenders improve. Attackers improve faster.**

This is the reality of data security in 2026. It is not that technology is inadequate; it is that human defenses are fragile.
You run security training for staff, but AI can craft attacks more convincing than your training examples.
You set up multi-factor authentication, yet AI can mimic your boss’s voice on a call and tell you “send the money first, fill in the paperwork later.”

When human vigilance cannot be trusted, your final line of defense must be this:
**Even if a human falls victim, whatever the attacker gains remains unusable.**

---

## This Is the Fundamental Difference Between Encrypted and Unencrypted Storage

Let’s walk through a real-world scenario.

Your company suffers a phishing attack. A finance employee opens an email disguised as a supplier invoice and enters their cloud storage password. Attackers gain access to the cloud drive.

**Scenario A: No encryption**
Attackers log into the cloud drive and view every file: contracts, financial statements, payroll records, client data, board meeting minutes. Everything is plaintext. They download the whole archive. Days later, you receive a ransom note: “Pay 50 Bitcoin, or these files get posted on the dark web.”

**Scenario B: Encrypted, but the keys are held by the service provider**
Attackers open the cloud drive and see encrypted files. But they already hold your account credentials — and your account is authorized to decrypt the files (the provider needs this permission for online preview, full-text search and other features). The attackers can decrypt everything anyway. The outcome is identical to Scenario A.

**Scenario C: True end-to-end encryption, with keys held only by you**
Attackers log into the cloud drive and only see ciphertext. They attempt decryption — but the decryption key is not tied to your account, not stored on the server, and not accessible remotely. The key lives only in the secure storage of your local device. All the attackers get is random bytes.

Random bytes have no ransom value.
Random bytes will not leak onto the dark web.
Random bytes will not trigger urgent calls of complaint from your customers.

This is what DoraBox is built for.

---

## DoraBox’s Design Philosophy: Assume Humans Will Make Mistakes

Most security products are built on one premise: *users will not make mistakes*.
Use strong passwords, enable 2FA, avoid suspicious links, rotate passwords regularly.

DoraBox starts from a different premise: **humans will make mistakes.**

This assumption is more honest — and far more secure.

Built around this principle, DoraBox makes a set of “radical” design choices:

### 1. Keys never leave your device

Your encryption key is generated locally on your device and is never uploaded to any server.
Even if your credentials are phished, leaked via credential stuffing, or stolen by an insider, the attacker gains nothing from your account. The account only grants access to ciphertext; the decryption key stays separate.

### 2. No convenient backdoors in the entire workflow

DoraBox has no “forgot password” function. No password reset via email. No customer-service unlock option.
Each of these convenience features expands the attack surface. A password-reset function means the provider can decrypt your data — which also means it can be compelled to decrypt it. A support unlock means a human can view your data, and that human can be socially engineered.

DoraBox chooses inconvenience. That inconvenience is your protection.

### 3. Brute-force attempts end in data erasure, not a breach

After repeated failed verification attempts, the local key is wiped. Your ciphertext files remain, but they become permanently undecryptable unless you complete the full offline, multi-step, time-bound identity recovery workflow.

For attackers, this means: guess the password wrong, and the data vanishes.
It is not “the safe was opened.” It is “the safe melted down.”

### 4. Encryption engineered for the year 2036

It currently uses AES-256-GCM encryption, paired with Argon2id key derivation and X25519 key encapsulation — the gold standard for civilian cryptography in 2026.
But DoraBox looks beyond today’s threats.

Cybersecurity researchers have validated an attack strategy called **Harvest Now, Decrypt Later**. Attackers do not bother cracking encrypted data now. They simply archive the ciphertext and wait for mature quantum computing to decrypt it years down the line. Data you believe is safe today could be unlocked by a “quantum key” in five or ten years.

DoraBox’s architecture reserves an upgrade path for post-quantum algorithms. Data you store today stays secure in 2036 and beyond.

---

## How 27 People Beat 28 Companies

Let us return to the opening news story.

Twenty-seven people extorted $40.5 million. They did not win with superior technical exploits. They won by targeting humans.

They had no need to breach your firewall. They only needed one person to pick up an AI-generated call and believe the boss was ordering a transfer.
They had no need to crack your encryption. They only needed one person to enter their password on a fake website.

In an era where human reliability can no longer be taken for granted, the most valuable security decision you can make is this:
**Do not rely on people never slipping up. Rely on this: even when people slip up, your most critical data stays locked.**

Your password may leak. Your inbox may get phished. Your phone may be lost. Your laptop may be compromised. Your account may be hijacked.

But your DoraBox stays locked.

Not merely because you use a strong password. Because keys live offline. Because failed brute-force attempts erase access. Because it is built to resist quantum computing.

Those 27 people outmaneuvered 28 businesses. They cannot outmaneuver this box.

---

## A Final, Personal Note

Everyone keeps something on their phone that must never be seen by others.
Nothing illegal. Nothing shameful. Just something private.

It might be a letter, a photograph, a journal entry, a plan you are not ready to share with anyone.

These things deserve a place that stays locked.
Not because you have something to hide. But because some things belong only to you.

**DoraBox**
Encrypted private data storage | Zero-knowledge architecture | Local key management
No plaintext in transit or at rest | Post-quantum-ready encryption design